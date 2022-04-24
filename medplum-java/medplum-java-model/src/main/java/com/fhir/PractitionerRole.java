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
    as = ImmutablePractitionerRole.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PractitionerRole {
  Optional<id> id();

  Optional<Reference> practitioner();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Reference>> endpoint();

  Optional<code> language();

  Optional<Reference> organization();

  Optional<Boolean> active();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<String> availabilityExceptions();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> location();

  Optional<List<Reference>> healthcareService();

  Optional<List<Identifier>> identifier();

  Optional<uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Period> period();

  Optional<List<PractitionerRole_AvailableTime>> availableTime();

  Optional<Meta> meta();

  Optional<List<ContactPoint>> telecom();

  Optional<List<CodeableConcept>> code();

  Optional<List<PractitionerRole_NotAvailable>> notAvailable();

  Optional<Narrative> text();

  static ImmutablePractitionerRole.ResourceTypeBuildStage builder() {
    return ImmutablePractitionerRole.builder();
  }
}
