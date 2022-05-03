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
  Optional<Uri> implicitRules();

  Optional<String> resourceType();

  Optional<String> name();

  Optional<Reference> compartment();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<AccessPolicy_Resource>> resource();

  Optional<Id> id();

  static ImmutableAccessPolicy.Builder builder() {
    return ImmutableAccessPolicy.builder();
  }
}
