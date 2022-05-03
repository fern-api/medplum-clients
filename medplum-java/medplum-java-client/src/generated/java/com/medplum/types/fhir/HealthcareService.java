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
    as = ImmutableHealthcareService.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService {
  Optional<Boolean> appointmentRequired();

  Optional<List<HealthcareService_Eligibility>> eligibility();

  Optional<List<HealthcareService_NotAvailable>> notAvailable();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> communication();

  Optional<List<CodeableConcept>> referralMethod();

  Optional<List<HealthcareService_AvailableTime>> availableTime();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> specialty();

  Optional<Markdown> extraDetails();

  Optional<Meta> meta();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Boolean> active();

  Optional<Reference> providedBy();

  Optional<List<CodeableConcept>> characteristic();

  Optional<List<Reference>> endpoint();

  Optional<String> comment();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> location();

  Optional<List<CodeableConcept>> type();

  Optional<Attachment> photo();

  Optional<List<CodeableConcept>> program();

  Optional<List<Reference>> coverageArea();

  Optional<List<CodeableConcept>> serviceProvisionCode();

  Optional<List<CodeableConcept>> category();

  Optional<List<ContactPoint>> telecom();

  Optional<String> availabilityExceptions();

  static ImmutableHealthcareService.ResourceTypeBuildStage builder() {
    return ImmutableHealthcareService.builder();
  }
}
