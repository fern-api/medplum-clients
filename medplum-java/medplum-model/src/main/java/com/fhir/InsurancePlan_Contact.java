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
    as = ImmutableInsurancePlan_Contact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Contact {
  Optional<List<Extension>> modifierExtension();

  Optional<HumanName> name();

  Optional<String> id();

  Optional<CodeableConcept> purpose();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> extension();

  Optional<Address> address();

  static ImmutableInsurancePlan_Contact.Builder builder() {
    return ImmutableInsurancePlan_Contact.builder();
  }
}
