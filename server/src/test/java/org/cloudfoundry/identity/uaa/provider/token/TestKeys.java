package org.cloudfoundry.identity.uaa.provider.token;

public class TestKeys {

    /*
        keytool -genkey -keystore machine.jks -alias m -storepass <PASSWORD> -keypass <PASSWORD> -keyalg RSA 
        -sigalg SHA256withRSA -keysize 2048 -storetype JKS -validity 3650 
        -dname "CN=dspmicro, OU=Predix, O=GE L=San Ramon, S=CA, C=US" -v

        keytool -list -rfc -keystore machine.jks -alias m -storepass <PASSWORD>
        
        keytool -list -rfc -keystore machine.jks -alias m -storepass <PASSWORD> > m.crt
        
        keytool -v -importkeystore -srckeystore machine.jks -srcalias m -destkeystore mp12.p12 -deststoretype PKCS12
        
        openssl pkcs12 -in mp12.p12 -nocerts -nodes
        
        openssl x509 -in m.crt -pubkey -noout
        
        openssl rsa -in priv.key -out old-format-priv.key

     */
    static final String TOKEN_VERIFYING_KEY =  "-----BEGIN PUBLIC KEY-----\n"
            + "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhxvEgeHTQJ0JLiQY5UHm\n"
            + "sSSEc0Jt3rRLOcQbVviAjOh/VT7VHWlIHqXU5t6thbpUbjtPs818UEXQO85iuWI8\n"
            + "Tp5CRuYnRFQAoGAM7V0kIwOUGwXhOgZBY7BQ+I+O3MFQn4nFp8z5u522RbFg+aNN\n"
            + "QCLyXZLizdRDVDvfKih/D1nnNUO19bj9wdZ32MvpKDW2lmMk5Zkq0BVwSyXEvn/w\n"
            + "TSlBr2nDRhTNPuk+JFawgZQosNRfdh1ElEJm3tge81JSUg/NLPsCADUWmtRohaVh\n"
            + "IGdpqS0APywO3xdGz73UY4xkFtqaaKp1vDXw9ljHUkaZyPswnKu8SErvGdTvIDbK\n"
            + "fQIDAQAB\n"
            + "-----END PUBLIC KEY-----";

    static final String TOKEN_SIGNING_KEY = "-----BEGIN RSA PRIVATE KEY-----\n"
            + "MIIEogIBAAKCAQEAhxvEgeHTQJ0JLiQY5UHmsSSEc0Jt3rRLOcQbVviAjOh/VT7V\n"
            + "HWlIHqXU5t6thbpUbjtPs818UEXQO85iuWI8Tp5CRuYnRFQAoGAM7V0kIwOUGwXh\n"
            + "OgZBY7BQ+I+O3MFQn4nFp8z5u522RbFg+aNNQCLyXZLizdRDVDvfKih/D1nnNUO1\n"
            + "9bj9wdZ32MvpKDW2lmMk5Zkq0BVwSyXEvn/wTSlBr2nDRhTNPuk+JFawgZQosNRf\n"
            + "dh1ElEJm3tge81JSUg/NLPsCADUWmtRohaVhIGdpqS0APywO3xdGz73UY4xkFtqa\n"
            + "aKp1vDXw9ljHUkaZyPswnKu8SErvGdTvIDbKfQIDAQABAoIBAAU1peMYMQwZwgPc\n"
            + "cnVMkDeeX9kN46ylqQzmKeO1m0dTo61GyfLjX1uHK2lnhqtUXvMNKGqXbsatmnTj\n"
            + "5VyelBK3+XhAYZ052/hTG8x/Peh3t9s+48tX+Gd+ofCjoG+UqKYuKsfomGyKjT+s\n"
            + "sj+N82mYr126TzJ+j8YMtPMsMpIF6AhZPT/WJTimDktlp20oVYFXsNxGuLecaWzl\n"
            + "ZRwfRrUuN495PE2fQx1WCWl5rHJbYxgyeQwtm18ksHRRxpqK2/uj1LGM54s0+Deg\n"
            + "gWDBIjrNSd5PQWqTh+xz5qZajAO2dAcbz2PzWkJjuC7qXAmVUyWjJXDHV6Re+DQJ\n"
            + "r+DIqiECgYEAyTru23IU4TV/madjuWyuBK1hEZTriOzt/lOlH1ETNzpQWMnq7qDZ\n"
            + "ovPI10KD86BkfjJORNIQX3VeWw1//htJqsEVyma4KnDzxcvp5a63NIYzE/YIp8z7\n"
            + "aaTv4x0Jik+ULlaYIpyFKAI5hUrY4rvNC8rZCQO+8joyRGjRPLehnWUCgYEAq+Gv\n"
            + "xARCcmAKY0NX5OL2WuvTJncdk3fbqikPLtjfA2LJB+1q/09ENUZzf4yD1BNZdaeY\n"
            + "uDTz6wWO439DXk3oLvYzNwJ6Py8qRrfynXTqbXHVChCif8UQRzeJpVGILxq1raPp\n"
            + "EMsooB1El/pCtXyA+jD1knuReFSLFZGE+MS3UzkCgYAueY3w4Mgxu0ldE2vUx2Tp\n"
            + "b6GbjelYFmBg/LCGKxNlDfLAjuHTexLIr8US8inHeqO7AaNSAbIGWfUQ0m1dIrBA\n"
            + "35dIx7CBHNUwOYgro85sMxJY6dnV52GpZI6CxZIOf5KZoSZB2CRouRrPzhmJRBZ3\n"
            + "QsIdcuAG0aoKYqrwevi4gQKBgH5yUJD+pTdpShsOTtn20k+/D55LoPl9Ap/jBuVq\n"
            + "7F2cTdJEKiPa143t30glQlJBTd3NRv+1DQCIHT9lv1TgMYBi5PiCHRbghtRxvM1z\n"
            + "VobfaF+4LyOaAMizpdJ18Z7domw0mmAdZSyte2nm1S6YgnYMkIyL1U/VumBKpq0w\n"
            + "YsGZAoGACqVEK6LXrfhcVRhScD51tYzv/dqimVezZw4YeeW7iRkydfRmf7QW16CO\n"
            + "4qbzfoDM8RP0bsRaxtkxPi1wic/CsN7iyYsLKC1KOhg9NiYrfiX4gcYHC/PEGK8x\n"
            + "3upYUhE4xaReJ0wKBFVWOeQZjHW+RZMxDf7RHv71f7SFN87YNGY=\n"
            + "-----END RSA PRIVATE KEY-----";
    
    

    static final String INCORRECT_TOKEN_SIGNING_KEY = "-----BEGIN RSA PRIVATE KEY-----\n"
            + "MIIEowIBAAKCAQEAvBdlBa3I4sQNfwATpJ6I2aw5AfYqUqoc22fYpUg8hpUq2iXd\n"
            + "9MDmmoz+zbEv9hOAPi5U+/Gzye6ryqmnEdSt7onKQ/4Ar27kyaezxcrqNn5C6J4b\n"
            + "S8Z/pCpfSWse2xYq6dWgWXZbgKHzZh4rmcwOIc+buKef0up2Er6XEoYbDIUSl8+l\n"
            + "LtGlb+WeTnH8lmbvpP4y6I58L5zJsENCfTdCAZV9YVSai4wK23Y/cPMGnBAsASSJ\n"
            + "xiPKuGbBA9VXwHnYcutbwOd+6B2Tunintr9xZeyQ5kGyqu6AKsaDpCa6Letx/p8g\n"
            + "RqhXJdB2cBGjWSNR26pnq7GexSC0SnCtNz9ZiQIDAQABAoIBACUwgvryd4vOs9Ru\n"
            + "kXO1HN3dHZBzub6KgBYpnD5h4AXELKrhXdds5KueQSsuY4tGI88nngoKqj+8/x6d\n"
            + "GLl/0bweZm23JS+Kv5XXoMX07wZDRLt1t3PuFYLCFgEQOxOaeHWvlXra2hC+9L82\n"
            + "K+zG2ex5fhKuof0z+pCOOpShC2wX9N3t4uKIE5jDIRIDKZaOZzKWEe4k7trXH4Lx\n"
            + "rzjxOpHepubCp/z2ZGFP9DgfJPdf94ntUXdibwkU8EcGTXYAeZwLtzuw6fNJfSBJ\n"
            + "gCGv08GK6Py5/ax8OxUvsYtIZQW8bMkNR+iPLD4tMvcepuzTKcIhN/WCV7JH/y6X\n"
            + "neJ5UwECgYEA4P4M2TGSMJWk2BzR16HY+s53uAs73b7RTbTNI6FfZ8q8zE69aREo\n"
            + "k7Fyi8gpGtz1R7LLHgIoCI6mX4aHi3F+Y1dcc/010xzajKeEPI8GZLza4kQVOV+a\n"
            + "ewmky0R4F+4gI8e5G86HvSaQeJ4nJYnWhDJOO3MYiQOo9vu56bhyERkCgYEA1gNw\n"
            + "/YeFlpRXawQ4q2vNfzrchwezzKKKjwaeqCbJ/kRqHwHiuderZAvH7dHk4uKv6f93\n"
            + "Q8PoCJViKB5OEKijCWMMm6zumyfFaPNLBW1YIwltJIF6ThkSCwc8YGZwogyOwy5c\n"
            + "z9eRUHAlxbTNkUy10MHq2YwKvOt5r6oC0LrqafECgYEAkJxZj8QfzWBxeoJTkcAy\n"
            + "IUpRgpad3PHHv6VE8PDIzIJvhPXbIkvoA73a/OMjIGQCtxnBGcGTD6T4ZI+oUUUa\n"
            + "UimVf+uxC8cQ5bTJ9s6K8na8TRArgBvlw804AXo5ok/oknbNkITXlAjUdOJaEPOe\n"
            + "UIuw4t8gVvhmQpEbNpDZqAkCgYAai6i7OdEfIV1Kf+aLlL6Tlnh+Iz1xF4Q6Q2bw\n"
            + "kochi9jh6bj2tkKjETcGT6+lWNrbGn3voOAqGGVpdoDWXiSC6I9KzAN4qVE6OFtI\n"
            + "3Aw/pE6uZYUHJOLxDT+28V3tK8OVgC2w9hsnMBHvWQLaj/pJX5RC0bUPQ+H/IQZi\n"
            + "X5zt8QKBgBl2Zp8jSOkYA1LV8tzAWih51NR0ZoMVmXygZDfRdXwofJ8WqQCKwX66\n"
            + "n3xnWRSRszc7b10W+XLzJM4H5mcH0FpkiQKUZMYSE6mkyOFW5Yplzh/9cOvb2g4m\n"
            + "FVed3utJ8vGa/fHq+zv4EBlCLnBh0lKka5WzL1efTYa7mtoEUT/D\n"
            + "-----END RSA PRIVATE KEY-----\n";

}