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
  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> referralMethod();

  Optional<List<CodeableConcept>> communication();

  Optional<List<CodeableConcept>> serviceProvisionCode();

  Optional<List<HealthcareService_AvailableTime>> availableTime();

  Optional<Reference> providedBy();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<CodeableConcept>> category();

  Optional<Boolean> appointmentRequired();

  Optional<List<Reference>> location();

  Optional<String> name();

  Optional<List<HealthcareService_Eligibility>> eligibility();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> extraDetails();

  Optional<List<Extension>> extension();

  Optional<Attachment> photo();

  Optional<List<Reference>> coverageArea();

  Optional<List<CodeableConcept>> characteristic();

  Optional<List<HealthcareService_NotAvailable>> notAvailable();

  Optional<String> availabilityExceptions();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> type();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<CodeableConcept>> program();

  Optional<String> comment();

  Optional<List<Reference>> endpoint();

  Optional<Meta> meta();

  Optional<List<ContactPoint>> telecom();

  Optional<Narrative> text();

  Optional<Boolean> active();

  static ImmutableHealthcareService.ResourceTypeBuildStage builder() {
    return ImmutableHealthcareService.builder();
  }
}
