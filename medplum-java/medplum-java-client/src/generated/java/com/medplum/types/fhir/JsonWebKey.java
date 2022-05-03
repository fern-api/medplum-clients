package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> q();

  Optional<Boolean> active();

  Optional<String> qi();

  Optional<List<String>> x5c();

  Optional<String> d();

  Optional<String> resourceType();

  Optional<Code> language();

  Optional<String> e();

  Optional<String> x5t();

  Optional<List<String>> key_ops();

  Optional<String> n();

  Optional<String> alg();

  Optional<String> kid();

  Optional<String> p();

  Optional<String> dq();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<String> use();

  Optional<String> dp();

  Optional<String> kty();

  Optional<Uri> implicitRules();

  static ImmutableJsonWebKey.Builder builder() {
    return ImmutableJsonWebKey.builder();
  }
}
