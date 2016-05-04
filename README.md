# Spring Tool Suite Example & FAQ

## Where can I get STS?

> [Download STS](http://spring.io/tools/sts/all)

## Can I integrate STS to my Eclipse?

> *Yes*

> [Update Sites](http://spring.io/tools/sts/all)

1. Start eclipse and click menu item as `Eclipse`->`Window`->`Preferences`->`Install/Update`->`Available Software Site`->`Add`;
2. Copy site address from [Update Sites](http://spring.io/tools/sts/all),such as: http://dist.springsource.com/release/TOOLS/update/e4.5/ ;
3. Paste site address to `Location` and name your site, such as `Spring STS`;
4. Click `Ok` to save it and click `Ok` again to exit setting;
5. Click `Help`->`Install New Software`;
6. Select `Spring STS` or name in step 3 in `Work with:` and wait eclipse to get full list of softwares can be installed or updated;
7. Choose `Core / Spring IDE` and click `Next` to install it.
 
## How can I install lombok in my eclipse?

1. Download `lombok` from [official site](https://projectlombok.org/) to local directory such as `c:\Users\User\Downloads`;
1. Start `cmd` and change directory to download directory such as `c:\Users\User\Downloads`;
1. Make sure `java` is on your `%PATH%` and execute: `java -jar lombok-x.x.x.jar`;
1. In the interface of `lombok-x.x.x.jar` choose the location of your eclipse installation and click `Select` and `Install / Update`;
1. Exit `lombok-x.x.x.jar`;
1. Exit eclipse;
1. Restart eclipse;

`Please DO NOT try to restart eclipse from 'File->Restart' menu directly, it may not work sometime.`
