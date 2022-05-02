package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBinary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Binary {
  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Code> contentType();

  Optional<Reference> securityContext();

  Optional<Code> language();

  Optional<Base64Binary> data();

  Optional<Id> id();

  String resourceType();

  static ImmutableBinary.ResourceTypeBuildStage builder() {
    return ImmutableBinary.builder();
  }
}
