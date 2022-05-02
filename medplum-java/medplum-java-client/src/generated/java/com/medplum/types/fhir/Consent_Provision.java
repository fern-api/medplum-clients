package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableConsent_Provision.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Provision {
  Optional<List<Consent_Data>> data();

  Optional<Period> period();

  Optional<List<Coding>> securityLabel();

  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> extension();

  Optional<Consent_provisionType> type();

  Optional<String> id();

  Optional<List<Coding>> purpose();

  Optional<List<Consent_Provision>> provision();

  @JsonProperty("class")
  Optional<List<Coding>> _class();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> dataPeriod();

  Optional<List<CodeableConcept>> action();

  Optional<List<Consent_Actor>> actor();

  static ImmutableConsent_Provision.Builder builder() {
    return ImmutableConsent_Provision.builder();
  }
}
