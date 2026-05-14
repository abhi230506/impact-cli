# impact-cli

A small command-line utility built with [picocli](https://picocli.info/).

This project was made for the **impact.com / SaaSquatch Java Software Engineer co-op** application. Running the CLI prints our company branding to the console.

## Requirements

- Java 17+
- Gradle (the included `./gradlew` downloads the pinned Gradle distribution on first run)

## Build and run

```bash
./gradlew run
```

## Help and version

Standard picocli options are enabled:

```bash
./gradlew run --args='--help'
./gradlew run --args='--version'
```

## License

Provided as-is for application purposes.
