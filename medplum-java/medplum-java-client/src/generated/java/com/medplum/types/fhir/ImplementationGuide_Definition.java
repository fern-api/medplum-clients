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
    as = ImmutableImplementationGuide_Definition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Definition {
  Optional<ImplementationGuide_Page> page();

  Optional<List<ImplementationGuide_Grouping>> grouping();

  Optional<List<ImplementationGuide_Parameter>> parameter();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ImplementationGuide_Template>> template();

  List<ImplementationGuide_Resource> resource();

  Optional<List<Extension>> extension();

  static ImmutableImplementationGuide_Definition.Builder builder() {
    return ImmutableImplementationGuide_Definition.builder();
  }
}
