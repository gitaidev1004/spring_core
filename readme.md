# 1. 스프링의 개요

JDK1.8 - https://adoptium.net/download

Eclips(eGovFrame 3.9) = https://www.egovframe.go.kr/home/sub.do?menuNo=41

프로젝트 템플릿 - https://github.com/hjk7902/spring/ 안의 workspace-spring.zip을 다운로드

오라클 11 XE 11G R2 : https://www.oracle.com/database/technologies/xe-prior-release-downloads.html

<br>

## 1.1 스프링의 역사

### 1.1.1 자바 프로그래밍의 변화

자바프로그래밍 -> JDBC Workshop -> XML -> Servlet/JSP -> RMI -> OOAD -> EJB
	- Client(Heavy Weight Client) <-> Server(DB): Server에 DB와 SQL을 모두 저장되어 있음
	- Client <-> Middle Server <-> Server(DB): Server에 DB가 있고 SQL은 Middle Server를 가지고 있음
	- Client(Browser) <-> Web Server(Server)

지금은 자바 -> 스프링

스프링
	- 스프링: 스프링 부트 또는 스프링 프레임워크를 의미
  - 브레인웨어

스프링 부트
  - 정확히는 스프링 부트 프레임워크
  - 스프링 프레임워크를 이용한 개발 초기의 진입장벽을 낮춘 프레임워크

스프링 프레임워크
  - 스프링 레거시 프레임워크라고 부르면 스프링 부트 프레임워크와 구분됨

공식 사이트: spring.io

지금의 스프링은 다양한 프로젝트를 제공함
  -  스프링 부트, 스프링 프레임워크, 스프링 클라우드, 스프링 시큐리티, 스프링 데이터 등등
  - 스프링 프로젝트라고 부르면 스프링 부트 또는 스프링 프레임워크를 이용한 프로젝트를 의미함
  - 스프링 부트와 스프링 프레임워크는 주로 웹 개발에 사용함
  - Spring Web MVC 프레임워크가 웹 개발에 가장 많이 사용됨

<br><br>

## 1.2 스프링 프레임워크의 개요

EJB를 주 프레임워크로 사용할 때 불편했던 점들을 해소.
2002년 로드 존슨이 출판한 도서 Expert One-on-One J2EE Design and Development 에 선보인 코드가 Spring의 근간이 됨.
이 도서를 읽은 개발자들이 "코드가 책으로만 존재하기에는 너무 아깝다"며 로드 존슨의 허가를 받은 뒤 프레임워크로 발전시킴.
2003년 6월 Apache 2.0 License로 공개됨.

<br>

### 1.2.1 스프링 프레임워크의 특징

엔터프라이즈 애플리케이션 구축을 위한 솔루션
모듈화되어 있어 필요한 부분만 사용 가능
선언적 트랜잭션 관리 가능
완전한 기능을 갖춘 MVC 프레임워크 제공
AOP 기능 사용 가능

<br>

### 1.2.2 스프링 프레임워트의 장점

생산성
품질보증
유지보수



<br><br>


## 1.3 스프링 프레임워크의 구성 요소



<br><br>


## 1.4 스프링 프레임워크의 특징

<br><br>


# 2. 스프링 개발환경 설정

## 2.1 JDK 다운로드 및 설치

### 2.1.1 JDK 다운로드

JDK1.8 - https://adoptium.net/temurin/releases/?version=8&os=windows 에서 JDK - 106MB .zip 을 다운로드 받습니다.

<br>

### 2.1.2 JDK 설치

다운로드 받은 "OpenJDK8U-jdk_x64_windows_hotspot_8u422b05.zip" 을 압축을 해제하고, C:\dev 디렉터리 안에 압축 해제한 "jdk8u422-b05"를 붙여넣기합니다.

<br>

### 2.1.3 자바 환경 설정

<br><br>



## 2.2 Eclips(eGovFrame 3.9) 다운로드 및 설치

### 2.2.1 Eclips(eGovFrame 3.9) 다운로드

https://www.egovframe.go.kr/home/sub.do?menuNo=41 에서 "3.9.0	개발자용 개발환경 32&64bit(Implementation Tool) Version 3.9.0" 항목의 "eGovFrameDev-3.9.0-64bit.exe [1,290,915,941 Byte]"를 클릭하여 다운로드 받습니다.

<br>

### 2.2.2 Eclips(eGovFrame 3.9) 설치

다운로드 받은 "eGovFrameDev-3.9.0-64bit.exe"를 더블클릭하고 압축 풀기 경로를 "C:\dev"로 지정하여 [압축 풀기]를 합니다.

<br><br>

## 2.3 프로젝트 템플릿 

### 2.3.1 프로젝트 템플릿 다운로드

https://github.com/gitaidev1004/spring/ 안의 workspace-spring.zip을 다운로드 받습니다.

<br>

### 2.3.2 프로젝트 템플릿 설치

다운로드 받은 "workspace-spring.zip"를 압축을 해제한 후 workspace-spring 디렉터리를 복사하기 하여 "C:\dev"에 넣습니다.

<br>

## 2.4 프로젝트 생성


<br><br><br>

# 3. Spring Legacy Project DI(Dependency Injection)

의존성 주입(Dependency Injection): 


## 3.1 자바 의존성 주입(Dependency Injection) 실습

### 3.1.1 DI를 사용하지 않는 코드

<br>

### 3.1.2 생성자(Constructor) 주입(Dependency Injection)

<br>

### 3.1.3 수정자(Setter) 주입(Dependency Injection)

<br><br>


## 3.2 스프링에서 XML을 이용한 의존성 주입(Dependency Injection) 실습

Bean을 만들어 주입하면 항상 메모리에 로딩되어 있는 스프링 컨테이너에 넣어두고 개발자가 호출하면 스프링 컨테이너에서 가져와 활용한다.
그렇게 되면 개발자는 인스턴스를 계속 생성할 필요없이 스프링 컨테이너 

<br>

### 3.2.1 XML의 `<bean>` 태그

bean 태그의 주요 속성

| 속성            | 설명                                                                                                                                 |
|-----------------|--------------------------------------------------------------------------------------------------------------------------------------|
| `id`            | 빈의 고유 식별자를 지정하는 속성입니다. 이를 통해 애플리케이션 내에서 해당 빈을 참조할 수 있습니다.                                    |
| `class`         | 빈으로 등록할 클래스의 전체 경로(패키지 경로를 포함한 클래스 이름)를 지정합니다.                                                       |
| `name`          | 빈의 별칭(alias)을 지정할 수 있습니다. 여러 개의 별칭을 쉼표나 공백으로 구분해 나열할 수 있습니다.                                       |
| `scope`         | 빈의 범위를 정의합니다. 주요 값으로는 `singleton`(기본값), `prototype`, `request`, `session`, `global-session` 등이 있습니다.          |
| `init-method`   | 빈이 초기화될 때 호출할 메서드를 지정합니다. 주로 빈이 초기화될 때 추가적인 설정 작업이 필요할 경우 사용됩니다.                          |
| `destroy-method`| 빈이 소멸될 때 호출할 메서드를 지정합니다. 주로 빈이 소멸될 때 리소스 정리 작업이 필요할 경우 사용됩니다.                              |
| `lazy-init`     | 빈을 지연 초기화할지 여부를 지정합니다. `true`로 설정하면 해당 빈이 실제로 사용될 때까지 초기화되지 않습니다. (기본값은 `false`입니다.)    |
| `autowire`      | 빈의 의존성 주입 방식을 지정합니다. 주요 값으로는 `no`(기본값), `byName`, `byType`, `constructor`, `autodetect`가 있습니다.            |
| `depends-on`    | 해당 빈이 생성되기 전에 반드시 생성되어야 할 다른 빈의 이름을 지정합니다. 여러 빈을 지정할 경우 쉼표로 구분합니다.                        |
| `primary`       | 동일한 타입의 빈이 여러 개일 때 해당 빈을 기본으로 사용할지 여부를 지정합니다. (Spring 3.0부터 도입)                                     |
| `factory-method`| 빈을 생성하기 위한 팩토리 메서드를 지정합니다. 해당 메서드를 통해 객체가 생성됩니다.                                                     |
| `factory-bean`  | 팩토리 메서드를 호출할 빈의 이름을 지정합니다. 이 빈이 해당 메서드를 통해 다른 빈을 생성합니다.                                         |
| `abstract`      | 해당 빈이 다른 빈의 부모로만 사용되는 추상 빈임을 지정합니다. `true`로 설정하면 이 빈 자체는 인스턴스화되지 않습니다.                      |
| `parent`        | 해당 빈이 상속할 부모 빈을 지정합니다. 부모 빈의 설정을 상속받아 빈을 구성할 수 있습니다.                                                |


<br>

### 3.2.2 XML의 빈(bean) 설정

<br>

### 3.2.3 스프링 컨텍스트(Spring Context)

의존성 주입 내용을 외부파일로 작성하여 의존성 내용을 로딩하는 AbstractApplicationContext의 하위 클래스들


| 클래스/생성자                          | 설명                                                                                                   |
|----------------------------------------|--------------------------------------------------------------------------------------------------------|
| `ClassPathXmlApplicationContext`       | 클래스패스에서 XML 파일을 로드하여 빈 구성을 처리하는 컨텍스트입니다. Spring 설정 파일을 클래스패스에서 찾습니다.      |
| **생성자**                             |                                                                                                        |
| `ClassPathXmlApplicationContext(String configLocation)` | 단일 XML 설정 파일을 클래스패스에서 로드하는 생성자입니다.                                                  |
| `ClassPathXmlApplicationContext(String... configLocations)` | 여러 XML 설정 파일을 로드할 수 있는 생성자입니다.                                                          |
| `ClassPathXmlApplicationContext(String configLocation, ApplicationContext parent)` | 상위 컨텍스트를 가진 단일 XML 설정 파일을 로드하는 생성자입니다.                                             |
| `FileSystemXmlApplicationContext`      | 파일 시스템 경로에서 XML 파일을 로드하여 빈 구성을 처리하는 컨텍스트입니다. 파일 시스템의 절대 경로나 상대 경로를 사용합니다.   |
| **생성자**                             |                                                                                                        |
| `FileSystemXmlApplicationContext(String configLocation)` | 단일 XML 설정 파일을 파일 시스템 경로에서 로드하는 생성자입니다.                                            |
| `FileSystemXmlApplicationContext(String... configLocations)` | 여러 XML 설정 파일을 로드할 수 있는 생성자입니다.                                                          |
| `FileSystemXmlApplicationContext(String configLocation, ApplicationContext parent)` | 상위 컨텍스트를 가진 단일 XML 설정 파일을 로드하는 생성자입니다.                                             |
| `AnnotationConfigApplicationContext`   | 자바 어노테이션을 이용해 설정 클래스에서 빈 구성을 처리하는 컨텍스트입니다. XML이 아닌 자바 클래스 기반으로 설정합니다.           |
| **생성자**                             |                                                                                                        |
| `AnnotationConfigApplicationContext()` | 기본 생성자로, 설정 클래스가 나중에 추가될 수 있습니다.                                                      |
| `AnnotationConfigApplicationContext(Class<?>... annotatedClasses)` | 주어진 설정 클래스들을 즉시 등록하고 빈을 로드합니다.                                                       |
| `GenericXmlApplicationContext`         | XML 파일을 로드하여 빈을 정의하는 유연한 컨텍스트로, 클래스패스와 파일 시스템 경로 모두 사용할 수 있습니다.                           |
| **생성자**                             |                                                                                                        |
| `GenericXmlApplicationContext()`       | 기본 생성자이며, 이후 XML 설정 파일을 로드할 수 있습니다.                                                    |
| `GenericXmlApplicationContext(String... resourceLocations)` | 주어진 경로에서 XML 설정 파일을 로드하는 생성자입니다.                                                      |
| `GenericApplicationContext`            | XML, 어노테이션 등 다양한 방법으로 빈을 정의할 수 있는 가장 일반적인 컨텍스트입니다.                                      |
| **생성자**                             |                                                                                                        |
| `GenericApplicationContext()`          | 빈 설정을 유연하게 정의할 수 있는 기본 생성자입니다.                                                         |
| `StaticApplicationContext`             | XML 설정 없이, 프로그래밍 방식으로 직접 빈을 등록할 수 있는 컨텍스트입니다. 테스트 용도로 주로 사용됩니다.                             |
| **생성자**                             |                                                                                                        |
| `StaticApplicationContext()`           | 프로그램 내에서 직접 빈을 정의할 수 있는 기본 생성자입니다.                                                  |
| `WebApplicationContext`                | 웹 애플리케이션 환경에서 사용하는 Spring 컨텍스트로, 웹 관련 빈을 관리합니다. `AbstractApplicationContext`의 하위 클래스는 아니지만 웹 환경에서 주로 사용됩니다. |

<br>

### 3.2.4 bean 태그의 부속 요소

| 태그             | 속성                      | 설명                                                                                             |
|------------------|---------------------------|--------------------------------------------------------------------------------------------------|
| `constructor-arg` | `index`                   | 해당 생성자 인자의 인덱스를 명시함.                                                               |
|                  | `type`                    | 생성자 인자의 타입을 명시함.                                                                     |
|                  | `name`                    | 생성자 인자의 이름을 명시함.                                                                     |
|                  | `value`                   | 생성자 인자에 값을 직접 설정할 때 사용.                                                           |
|                  | `ref`                     | 다른 빈을 참조하는 경우 사용.                                                                    |
| `description`     | 없음                      | 빈에 대한 설명을 추가하는 태그로, 속성은 없고 내용을 텍스트로 기입.                                |
| `lookup-method`   | `name`                    | 빈 클래스에서 대체할 메서드 이름을 명시함.                                                        |
|                  | `bean`                    | 대체할 메서드를 통해 반환할 빈을 명시함.                                                          |
| `meta`            | `key`                     | 메타데이터의 키 값을 명시함.                                                                      |
|                  | `value`                   | 메타데이터의 값 값을 명시함.                                                                      |
| `property`        | `name`                    | 빈의 프로퍼티(Setter 메서드)의 이름을 명시함.                                                      |
|                  | `value`                   | 프로퍼티에 값을 직접 설정할 때 사용.                                                              |
|                  | `ref`                     | 다른 빈을 참조하는 경우 사용.                                                                    |
|                  | `type`                    | 프로퍼티의 타입을 명시함. (Spring 3.0부터 사용되지 않음)                                           |
|                  | `lazy-init`               | 해당 프로퍼티를 지연 로딩할지 여부를 설정 (`default`, `true`, `false`).                            |
| `qualifier`       | `type`                    | qualifier 타입을 명시함.                                                                          |
|                  | `value`                   | qualifier 값을 설정함.                                                                            |
| `replaced-method` | `name`                    | 교체할 메서드의 이름을 명시함.                                                                    |
|                  | `replacer`                | 교체할 메서드를 제공하는 빈의 이름을 명시함.                                                      |



bean 태그의 scope 속성이 가질 수 있는 지정값

| scope 값        | 설명                                                                                                    |
|-----------------|--------------------------------------------------------------------------------------------------------|
| `singleton`     | **기본값**으로, Spring 컨테이너 내에서 빈이 한 개의 인스턴스만 생성되고 해당 인스턴스가 모든 요청에 공유됩니다. 애플리케이션 전체에서 하나의 인스턴스만 사용됩니다. |
| `prototype`     | 요청할 때마다 새로운 빈 인스턴스를 생성합니다. 각 요청마다 별도의 객체가 반환되므로 상태를 공유하지 않으며, 빈의 생명 주기를 컨테이너가 관리하지 않습니다.        |
| `request`       | 웹 애플리케이션 환경에서 사용되며, 각 HTTP 요청마다 빈의 새로운 인스턴스를 생성하고 요청이 완료되면 소멸됩니다. (주로 Spring MVC에서 사용)     |
| `session`       | 웹 애플리케이션 환경에서 사용되며, 각 HTTP 세션마다 빈의 새로운 인스턴스를 생성하고 세션이 만료되면 소멸됩니다. (주로 Spring MVC에서 사용)      |
| `global-session`| 포털 애플리케이션 같은 특수한 환경에서 사용되며, 전역 HTTP 세션마다 빈의 인스턴스를 생성합니다. 주로 포털 환경에서 사용됩니다.                               |
| `application`   | 웹 애플리케이션 환경에서 사용되며, 서블릿 컨텍스트마다 빈의 인스턴스를 생성하고 해당 서블릿 컨텍스트 내에서 공유됩니다.                                   |


<br><br>

## 3.3 스프링에서 어노테이션(Annotation)을 이용한 의존성 주입(Dependency Injection) 실습

<br><br>

## 3.4 스프링에서 Java Config 파일을 이용한 의존성 주입(Dependency Injection) 실습

<br><br><br>

# 4. AOP(Aspect-Oriented Programming)

## 4.1 AOP 개요

<br><br>

## 4.2 XML을 이용한 AOP

<br><br>

## 4.3 Annotation을 이용한 AOP

<br><br><br>

# 4. 스프링 JDBC

## 4.1 오라클 설치

<br><br>

## 4.2 스프링 JDBC 설정

<br><br>

## 4.3 스프링 JDBC CRUD 실습

<br><br>

# 5. 스프링 TX

