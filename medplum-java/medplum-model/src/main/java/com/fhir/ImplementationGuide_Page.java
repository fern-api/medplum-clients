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
    as = ImmutableImplementationGuide_Page.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Page {
  Optional<String> id();

  Optional<Reference> nameReference();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ImplementationGuide_Page>> page();

  Optional<List<Extension>> extension();

  Optional<Implementationguide_pageGeneration> generation();

  Optional<String> title();

  Optional<String> nameUrl();

  static ImmutableImplementationGuide_Page.Builder builder() {
    return ImmutableImplementationGuide_Page.builder();
  }
}
