//print the char string by seperation using strtok function.
void main()
{
	char str[] = "this-is-a-string-with-some-char";
	char* tok = strtok(str,"-");
	do
	{
		printf("%s ",tok);                // tok means satring address
		tok = strtok('\0',"-");
	
	}while(tok!='\0');
}   