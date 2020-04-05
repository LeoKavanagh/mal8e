# MAL8E

Mal-ocht-e - Mallachtaí - Curses.

## What?

A Hello-World level Scala.js project that randomly selects
a curse in the Irish language, and prints it to the console.

The selection of curses is drawn from
[this Irish Times article](https://www.irishtimes.com/life-and-style/abroad/54-irish-curses-you-won-t-have-learned-in-school-1.3011527).
Currently it's a hard-coded list. It may in the future migrate to a database.

## Why?

Toisc gur féidir liom.

To 21st Century Anglophone ears, the curses in the list are often more
theatrical than genuinely offensive. For example:

 * Droch áird chúgat lá gaoithe - That you may be badly positioned on a windy day
 * Buineach dhearg go dtigidh ort - That you may have red (ferocious) diarrhoea

It's an amusing and slightly puerile aspect of the Irish language
that doesn't often get acknowledged.

## Getting Started

You'll need Scala, SBT, and
[Node.js](https://nodejs.org/en/) installed.

Install the required Node.js packages from `package-lock.json`:
```
npm ci
```

Generate the Javascript file with
```
sbt fullOptJS
```