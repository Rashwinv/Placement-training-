#include <iostream>
#include <string>

int main() 
{
    std::string s;
    int a = 0, b = 0;
    std::getline(std::cin, s);
    
    for (size_t i = 0; i < s.length(); i++) {
        if (s[i] == '#') 
            a++;
        else if (s[i] == '*')
            b++;
    }
    
    std::cout << b - a << std::endl;
    return 0;
}
