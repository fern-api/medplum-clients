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
    as = ImmutableImplementationGuide_Definition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Definition {
  Optional<List<ImplementationGuide_Parameter>> parameter();

  Optional<List<ImplementationGuide_Grouping>> grouping();

  Optional<ImplementationGuide_Page> page();

  Optional<String> id();

  List<ImplementationGuide_Resource> resource();

  Optional<List<ImplementationGuide_Template>> template();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImplementationGuide_Definition.Builder builder() {
    return ImmutableImplementationGuide_Definition.builder();
  }
}
