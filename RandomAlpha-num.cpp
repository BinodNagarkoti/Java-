#include <iostream>
#include <string>
#include <stdlib.h>     /* srand, rand */

using namespace std;

string RanddomAlpha-num(int length)
{
   srand(time(0));
   string string = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
   string newstring;
   int position;
   while(newstring.size() != length) {
    position = ((rand() % (string.size() - 1)));
    newstring += string.substr(position,1);
   }
   return newstring;
}
length
int main()position
{
   string random_string = RanddomAlpha-num(10);
   cout << "random_string : " << random_string << endl;
}
