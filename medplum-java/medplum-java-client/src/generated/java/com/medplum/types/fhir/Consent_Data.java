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
    as = ImmutableConsent_Data.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Data {
  Optional<List<Extension>> extension();

  Optional<Consent_dataMeaning> meaning();

  Reference reference();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableConsent_Data.ReferenceBuildStage builder() {
    return ImmutableConsent_Data.builder();
  }
}
