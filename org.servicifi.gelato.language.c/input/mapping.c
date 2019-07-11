
//TODO
// visitAssignmentExpression needs alot of work

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
        while (fread (input, sizeof(struct employee), 1, infile)==1) {
            es[i++] = input;
        }
                        
        fclose(infile);
        return es;		
    }
