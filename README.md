# Cucumber Test Automation Project

Bu proje, [demo.mersys.io](https://demo.mersys.io) adresindeki uygulama üzerinde Cucumber, Selenium WebDriver ve TestNG kullanılarak geliştirilmiş bir test otomasyon projesidir.

## 🚀 Kullanılan Teknolojiler

- Java 17
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven
- ExtentReports
- WebDriverManager
- IntelliJ IDEA

## 📁 Proje Yapısı

```plaintext
├── FeatureFiles/              # Gherkin ile yazılmış feature dosyaları
│   ├── TC701_UserRegister.feature
│   ├── TC702.feature
│   └── ...
│
├── Pages/                     # Page Object Model (POM) yapısı
│   ├── DialogContent.java
│   ├── LeftNav.java
│   └── ParentPage.java
│
├── Runners/                   # Test runner sınıfları
│   ├── _01_TestRunnerAll.java
│   ├── _04_TestRunnerSmoke.java
│   └── _05_TestRunnerRegression.java
│
├── StepDefinitions/          # Step definition (adım tanımlamaları)
│   ├── TC701_Steps.java
│   ├── TC702_Steps.java
│   └── ...
│
├── Utilities/                # Yardımcı sınıflar
│   ├── GWD.java              # Driver yönetimi (Singleton WebDriver)
│   ├── GWDParameter.java     # Parametreli driver yönetimi (parallel test için)
│   └── ...
│
├── XML/                      # TestNG XML dosyaları
│   └── ParallelTest.xml
│
└── pom.xml                   # Maven yapılandırma dosyası
```

## 🧪 Test Türleri

- **Smoke Test**: `_04_TestRunnerSmoke.java`
- **Regression Test**: `_05_TestRunnerRegression.java`
- **Tüm Testler**: `_01_TestRunnerAll.java`

## ⚙️ Testlerin Çalıştırılması

### 1. Maven ile bağımlılıkların yüklenmesi
```bash
mvn clean install
```

### 2. Tüm testleri çalıştırmak için:
```bash
Right-click on _01_TestRunnerAll.java → Run
```

### 3. Paralel test çalıştırmak için:
```bash
Right-click on ParallelTest.xml → Run
```

## 📊 Raporlama

- ExtentReports ile HTML formatında rapor oluşturulmaktadır.
- Raporlar test çalıştıktan sonra `target/extent-reports/` klasöründe oluşur.

## ✍️ Katkıda Bulunma

Her türlü katkıya açığız! Yeni test senaryoları, iyileştirme önerileri ve hata bildirimleri memnuniyetle karşılanır.

## 👥 Katkıda Bulunanlar

- [yilmaztuba.ty@gmail.com] - QA
- [hakan_merts@hotmail.com] - QA
- [gokdemir.aysenur@gmail.com] - QA
- [sewoesterserkan@gmail.com] - QA
- [burakboradurmaz@gmail.com] - QA
- [murattoksuz@gmail.com] - QA
- [canibr97@gmail.com] - QA
- [ennur789@gmail.com] - QA