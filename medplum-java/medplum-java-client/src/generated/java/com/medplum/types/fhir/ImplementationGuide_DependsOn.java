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
  Optional<List<Extension>> modifierExtension();

  Optional<Id> packageId();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Canonical uri();

  Optional<String> version();

  static ImmutableImplementationGuide_DependsOn.UriBuildStage builder() {
    return ImmutableImplementationGuide_DependsOn.builder();
  }
}
