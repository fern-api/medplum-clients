package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTerminologyCapabilities_Expansion.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Expansion {
  Optional<String> id();

  Optional<List<TerminologyCapabilities_Parameter>> parameter();

  Optional<Boolean> paging();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Boolean> hierarchical();

  Optional<markdown> textFilter();

  Optional<Boolean> incomplete();

  static ImmutableTerminologyCapabilities_Expansion.Builder builder() {
    return ImmutableTerminologyCapabilities_Expansion.builder();
  }
}
