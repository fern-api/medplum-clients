package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableProjectMembership.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProjectMembership {
  Optional<String> resourceType();

  Optional<Meta> meta();

  Optional<code> language();

  Reference user();

  Reference profile();

  Optional<Boolean> admin();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<Reference> userConfiguration();

  Reference project();

  Optional<Reference> accessPolicy();

  static ImmutableProjectMembership.UserBuildStage builder() {
    return ImmutableProjectMembership.builder();
  }
}
