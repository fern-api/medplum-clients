package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Boolean> incomplete();

  Optional<List<TerminologyCapabilities_Parameter>> parameter();

  Optional<String> id();

  Optional<Boolean> paging();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> hierarchical();

  Optional<Markdown> textFilter();

  Optional<List<Extension>> extension();

  static ImmutableTerminologyCapabilities_Expansion.Builder builder() {
    return ImmutableTerminologyCapabilities_Expansion.builder();
  }
}
