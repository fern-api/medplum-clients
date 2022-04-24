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
    as = ImmutableConsent_Data.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Data {
  Optional<Consent_dataMeaning> meaning();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Reference reference();

  Optional<List<Extension>> extension();

  static ImmutableConsent_Data.ReferenceBuildStage builder() {
    return ImmutableConsent_Data.builder();
  }
}
