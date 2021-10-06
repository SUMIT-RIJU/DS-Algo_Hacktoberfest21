#include <iostream>
using namespace std;

//function which is used to print the hollow pyramid of size n
void hollowPyramid(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i+1;j++) {
			if(i==1) {
				cout<<j<<' ';
			}
			else if(j==1) {
				cout<<i<<' ';
			}
			else if(j==n-i+1) {
				cout<<n<<' ';
			}
			else {
				cout<<' '<<' ';
			}

		}
		cout<<endl;
	}
}

int main() {
	int n;
	cin>>n;
  //calling the hollow pyramid function for a size n
	hollowPyramid(n);
}
