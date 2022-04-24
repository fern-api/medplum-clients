package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableJsonWebKey.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface JsonWebKey {
  Optional<String> qi();

  Optional<uri> implicitRules();

  Optional<String> dq();

  Optional<String> kid();

  Optional<Boolean> active();

  Optional<List<String>> x5c();

  Optional<String> alg();

  Optional<String> n();

  Optional<Meta> meta();

  Optional<String> x5t();

  Optional<code> language();

  Optional<String> dp();

  Optional<List<String>> key_ops();

  Optional<String> p();

  Optional<String> q();

  Optional<id> id();

  Optional<String> use();

  Optional<String> resourceType();

  Optional<String> kty();

  Optional<String> e();

  Optional<String> d();

  static ImmutableJsonWebKey.Builder builder() {
    return ImmutableJsonWebKey.builder();
  }
}
