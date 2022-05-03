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
    as = ImmutableImplementationGuide_DependsOn.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_DependsOn {
  Optional<Id> packageId();

  Optional<String> id();

  Canonical uri();

  Optional<List<Extension>> extension();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImplementationGuide_DependsOn.UriBuildStage builder() {
    return ImmutableImplementationGuide_DependsOn.builder();
  }
}
