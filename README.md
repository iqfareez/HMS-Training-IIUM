# HMS-Training-IIUM

HUAWEI Mobile Services Foundation Course Training Session

## Preparing HMS Core integration

### Huawei Console setup

1. Go to [Huawei Developer](https://developer.huawei.com/consumer/en/) website > [Console](https://developer.huawei.com/consumer/en/console) (Login with Huawei ID is prompted)
2. Under the Distribution and promotion, tap **AppGallery Connect**.
3. Click **My Projects** (Accept the agreements if prompted)
<!-- insert Screenshot 2021-08-12 100311.png -->
4. Give any name to the project and click **OK**
5. Wait for project creation. Then, under the **General information** tab, click **Add app**
<!-- insert Screenshot 2021-08-12 100642.png -->

### Android Project setup

6. Open **Android Studio** > <kbd>New Project</kbd>
7. Select **Basic Activity** > <kbd>Next</kbd>
8. Give it some beautiful name, package name, save location, languange (can choose Java or Kotlin), minimum SDK (>= API 17) > <kbd>Finish</kbd>
<!-- insert Screenshot 2021-08-12 101938.png -->
9. Project initialization can take quite some time. _Sabar itu indah_
10. Once finish, expand the **Gradle Scripts** (make sure you are on the correct view (Android))
11. Click on `build.gradle` file (app level)
<!-- insert Screenshot 2021-08-12 102356.png -->
12. Find the `applicationId`, then, copy the value.
<!-- insert Screenshot 2021-08-12 102621.png -->

### Now go back to Huawei console to where we left off

13. We can left the Platform and Device section as default.
14. Give an **App Name**.
15. In **Package name**, paste the value that we copied in step 12.
16. Select **App category** and **Default Language**.
17. Click **OK**
<!-- insert Screenshot 2021-08-12 103008.png -->
18. Once the app added, follow on-screen instruction on how to **Set up the SDK**
    <!-- insert Screenshot 2021-08-12 103218.png -->
    <!-- insert Screenshot 2021-08-12 103446.png -->
    <!-- insert Screenshot 2021-08-12 103836.png -->
    <!-- insert Screenshot 2021-08-12 104155.png -->
19. In **Step 3: Integrate services**, just click **Finish**

//TODO: https://developer.huawei.com/consumer/en/codelab/HMSPreparation/index.html#2
