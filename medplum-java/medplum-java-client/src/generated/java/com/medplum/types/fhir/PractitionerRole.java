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
    as = ImmutablePractitionerRole.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PractitionerRole {
  Optional<List<Reference>> endpoint();

  Optional<List<PractitionerRole_AvailableTime>> availableTime();

  Optional<List<PractitionerRole_NotAvailable>> notAvailable();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Reference>> healthcareService();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Boolean> active();

  Optional<Period> period();

  Optional<Reference> practitioner();

  Optional<Meta> meta();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Reference> organization();

  Optional<Code> language();

  Optional<List<ContactPoint>> telecom();

  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> location();

  Optional<Id> id();

  Optional<String> availabilityExceptions();

  static ImmutablePractitionerRole.ResourceTypeBuildStage builder() {
    return ImmutablePractitionerRole.builder();
  }
}
