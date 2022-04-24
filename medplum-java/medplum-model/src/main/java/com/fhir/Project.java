package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Reference> defaultPatientAccessPolicy();

  Optional<String> resourceType();

  Optional<code> language();

  Optional<Meta> meta();

  Reference owner();

  Optional<uri> implicitRules();

  Optional<String> description();

  Optional<List<code>> features();

  Optional<id> id();

  String name();

  static ImmutableProject.OwnerBuildStage builder() {
    return ImmutableProject.builder();
  }
}
