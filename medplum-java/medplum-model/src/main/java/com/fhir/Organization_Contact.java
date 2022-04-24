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
    as = ImmutableOrganization_Contact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Organization_Contact {
  Optional<Address> address();

  Optional<HumanName> name();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> purpose();

  static ImmutableOrganization_Contact.Builder builder() {
    return ImmutableOrganization_Contact.builder();
  }
}
