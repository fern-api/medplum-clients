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
    as = ImmutableProject.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Project {
  Reference owner();

  Optional<Reference> defaultPatientAccessPolicy();

  String name();

  Optional<Uri> implicitRules();

  Optional<String> resourceType();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<Code>> features();

  static ImmutableProject.OwnerBuildStage builder() {
    return ImmutableProject.builder();
  }
}
