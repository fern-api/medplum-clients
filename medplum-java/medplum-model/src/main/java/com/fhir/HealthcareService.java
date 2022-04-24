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
    as = ImmutableHealthcareService.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService {
  Optional<String> name();

  Optional<Boolean> appointmentRequired();

  Optional<List<Reference>> endpoint();

  Optional<List<CodeableConcept>> communication();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> extraDetails();

  Optional<List<ContactPoint>> telecom();

  Optional<List<CodeableConcept>> referralMethod();

  Optional<String> comment();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> category();

  Optional<List<CodeableConcept>> type();

  Optional<String> availabilityExceptions();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> serviceProvisionCode();

  Optional<uri> implicitRules();

  Optional<List<Reference>> coverageArea();

  Optional<Reference> providedBy();

  Optional<List<HealthcareService_Eligibility>> eligibility();

  Optional<code> language();

  Optional<List<Reference>> location();

  Optional<Attachment> photo();

  Optional<List<HealthcareService_NotAvailable>> notAvailable();

  Optional<List<HealthcareService_AvailableTime>> availableTime();

  Optional<Boolean> active();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> program();

  String resourceType();

  Optional<List<CodeableConcept>> characteristic();

  static ImmutableHealthcareService.ResourceTypeBuildStage builder() {
    return ImmutableHealthcareService.builder();
  }
}
