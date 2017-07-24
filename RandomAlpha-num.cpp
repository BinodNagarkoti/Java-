#include <iostream>
#include <string>
#include <stdlib.h>     /* srand, rand */

using namespace std;

string RandomString(int length)
{
   srand(time(0));
   string string = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
   string newstring;
   int position;
   while(newstring.size() != length) {
    position = ((rand() % (string.size() - 1)));
    newstring += string.substr(pos,1);
   }
   return newstring;
}

int main()
{
   string random_string = RandomString(10);
   cout << "randome_string : " << random_string << endl;
}
