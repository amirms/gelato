/*
  #include <stdio.h>
  #include <stdlib.h>
  #include <string.h>
*/

  /* structure to store employee salary details */
/*
  struct employee {
        int empId;
        char name[32];
        float basic, bonus, travel, gross, net;
  };
*/
/*
   #define SALARY_TAX_THRESHOLD 50000      // taxrate of the first $300
   #define LOW_RATE 0.15      // taxrate of the first $300
   #define HIGH_RATE 0.2       // taxrate of the next $150

   #define ACCOUNTS_FILE "accounts.dat"
*/
    struct employee* readEmployeeDetails(int num) {
	struct employee input, *es;

        FILE *infile = fopen (ACCOUNTS_FILE,"r");
        if (infile == NULL) {
            fprintf(stderr, "\nError opening accounts.dat\n\n");

            return NULL;
        }

        /* dynamically allocate memory to store employee salary details */
        es = (struct employee *)malloc(sizeof(struct employee) * num);

        int i=0;
        while (fread (&input, sizeof(struct employee), 1, infile)==1) {
            es[i++] = input;
        }
                        
        fclose(infile);
        return es;		
    }

    void updateEmployeeDetails(struct employee e) {
        struct employee input;

        FILE *outfile = fopen(ACCOUNTS_FILE,"rb+");
        
        if (outfile == NULL) {
            fprintf(stderr, "\nError opening accounts.dat\n\n");
        }     

        rewind(outfile);
        while(fread(&input,sizeof(input),1,outfile)==1)// fetch all records from file
        {
            if(strcmp(input.empId,e.empId)==0) {
                fseek(outfile,-sizeof(struct employee),SEEK_CUR); // move the cursor 1 step back from current position
                fwrite(&input,sizeof(struct employee),1,outfile); // override the record

                break;
            }
        }

        fclose(outfile);
        return;
    }

	// 2 TODO: 1) can I get the number of employees from file? then return the number of employees from function. 
/**
FILE *file;
long size;
size_t count, records;

file = fopen("myfile", "rb");
if (file == NULL) {
    perror("fopen");
    return 0;
}
if (fseek(file, 0, SEEK_END) == -1) {
    perror("fseek");
    return 0;
}
size = ftell(file);
if (size == -1) {
    perror("ftell");
    return 0;
}
if (fseek(file, 0, SEEK_SET) == -1) {
    perror("fseek");
    return 0;
}
records = size / sizeof(x);
for (count = 0; count < records; count++) {
     if (fread(&x, sizeof(x), 1, file) == 1) {
         printf("\n\nID:%d",x.ID); // %d instead of %ld
     } else {
         break;
     }
}
*/

    int main() {
        int i, ch, num, flag, empId;
        double byPercent, taxes;

        /* get the number of employees from the user  */
        printf("Enter the number of employees:");
        scanf("%d", &num);

        /* dynamically allocate memory to store employee salary details */
        struct employee* emps = readEmployeeDetails(num);

 	/* calculate the new payslip for the given employee ID */
        while (1) {
            printf("Enter employee ID to calculate new payslip:");
            scanf("%d", &empId);

            flag = 0;
            for (i = 0; i < num; i++) {
                if (empId == emps[i].empId) {
                    struct employee e = emps[i];

                    printf("Enter bonus for the employee:");
                    scanf("%f", &e.bonus);

                    printf("Enter salary raise for the employee (in percentage):");
                    scanf("%lf", &byPercent);

                    e.gross = e.basic + (byPercent * e.basic) / 100 +  e.bonus;

                    if (e.basic > SALARY_TAX_THRESHOLD) {
	                taxes = (e.gross - SALARY_TAX_THRESHOLD) * HIGH_RATE + SALARY_TAX_THRESHOLD * LOW_RATE ;
                    } else {
	                taxes = e.gross * LOW_RATE;
                    }

                    e.net = e.gross - taxes + e.travel;

                    /* printing payslip for the given employee ID */
                    printf("Salary Slip of %s:\n", e.name);
                    printf("Employee ID: %d\n", empId);
      
                    printf("\nNet Salary: %.2f Euros\n\n", e.net);

                    /* updating employee details for the given employee ID */
                    updateEmployeeDetails(e);
                    printf("Employee details updated.");

                    flag = 1;

                    break;
                }
            }

            if (!flag) {
                printf("No Record Found!!\n");
            }

            printf("Do You Want To Continue(1/0):");
            scanf("%d", &ch);

            if (!ch) {
                break;
            }
        }

        return 0;
    }

