# MoviesAPI

Movie Service
Movie Search is a database for storing and listing movies similar to iMDb, but with much less functionality.

Create an api from scratch that will fulfill the following requirements...

Details
Required Endpoints
POST: add a movie to the database
GET: all movies in the database
GET: one movie by imdbid
GET: all movies by Title
GET: Search for movies by actor (optional), director (optional), genre (optional), title containing a search string (required)
PATCH: add or update a star rating for a movie (1 - 5)
DELETE
Movie Description
movieId: Long PK
imdbId: String Unique
actors: String comma separated list of actors
director: String
title: String
year: String (bonus: set derived from released)
released: LocalDate
