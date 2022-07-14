[![LGPL 2.1](https://img.shields.io/badge/License-LGPL_2.1-blue.svg)](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlcontact/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlcontact)
[![Build and Test](https://github.com/japlscript/japlcontact/workflows/Build%20and%20Test/badge.svg)](https://github.com/japlscript/japlcontact/actions)


# Japlcontact

*Japlcontact* is a Java API for the Apple Contacts app (macOS) based on
[JaplScript](https://github.com/japlscript/japlscript).


## Installation

Japlcontact is released via [Maven](https://maven.apache.org).
You can install it via the following dependency:

```xml
<dependency>
    <groupId>com.tagtraum</groupId>
    <artifactId>japlcontact</artifactId>
</dependency>
```

The Maven artifacts also contain sources and javadocs. 

If you are using [modules](https://en.wikipedia.org/wiki/Java_Platform_Module_System),
its name is `tagtraum.japlcontact`.


## Usage
                           
To use the generated code, do something like this:

```java
import com.tagtraum.macos.contacts.Application;

public class GetMyCard {

    public static void main(final String[] args) {
        // get application
        final Application application = Application.getInstance();
        final Person card = application.getMyCard();
        System.out.println("My Card: " + card.getFirstName() + " " + card.getLastName());
    }
}
```

## API

You can find the complete [API here](https://japlscript.github.io/japlcontact/com/tagtraum/macos/contacts/package-summary.html). 


## Shipping

For information about shipping apps with this library, please see
the corresponding notes about signing, notarization etc. in the
[JaplScript documentation](https://github.com/japlscript/japlscript/blob/main/README.md).


**IMPORTANT** Counterintuitively, the bundle id for the Contacts app is `com.apple.AddressBook`. Should you
need to reset the sandbox using `tccutil`, you need to specify either `com.apple.AddressBook`
or just `AddressBook`. `Contacts` or `com.apple.Contacts` won't work.
