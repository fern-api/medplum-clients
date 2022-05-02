package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableAccessPolicy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AccessPolicy {
  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<AccessPolicy_Resource>> resource();

  Optional<Reference> compartment();

  Optional<Code> language();

  Optional<String> resourceType();

  Optional<Id> id();

  Optional<String> name();

  static ImmutableAccessPolicy.Builder builder() {
    return ImmutableAccessPolicy.builder();
  }
}
