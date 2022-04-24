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
    as = ImmutableImplementationGuide_DependsOn.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_DependsOn {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<id> packageId();

  Optional<List<Extension>> modifierExtension();

  canonical uri();

  Optional<String> version();

  static ImmutableImplementationGuide_DependsOn.UriBuildStage builder() {
    return ImmutableImplementationGuide_DependsOn.builder();
  }
}
