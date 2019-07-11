// C program for writing  
// struct to file 
#include <stdio.h> 
#include <stdlib.h> 
#include <string.h> 
  
// a struct to read and write 
struct employee {
    int empId;
    char name[32];
    float basic, bonus, travel, gross, net;
};
  
int main () 
{ 
    FILE *outfile; 
      
    // open file for writing 
    outfile = fopen ("accounts.dat", "w"); 
    if (outfile == NULL) 
    { 
        fprintf(stderr, "\nError opend file\n"); 
        exit (1); 
    } 
  
    struct employee input1 = {1, "amir saiedi", 45000, 1000, 535, 0, 0}; 
    struct employee input2 = {2, "eli sharma", 55000, 1000, 210, 0, 0}; 
      
    // write struct to file 
    fwrite (&input1, sizeof(struct employee), 1, outfile); 
    fwrite (&input2, sizeof(struct employee), 1, outfile); 
      
    if(fwrite != 0)  
        printf("contents to file written successfully !\n"); 
    else 
        printf("error writing file !\n"); 
  
    // close file 
    fclose (outfile); 
  
    return 0; 
}
