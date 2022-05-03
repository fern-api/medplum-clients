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
    as = ImmutableDevice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device {
  Optional<Reference> patient();

  Optional<List<Extension>> extension();

  Optional<Reference> definition();

  Optional<DateTime> manufactureDate();

  Optional<List<CodeableConcept>> statusReason();

  Optional<List<Device_UdiCarrier>> udiCarrier();

  Optional<String> serialNumber();

  Optional<List<Device_Version>> version();

  Optional<List<CodeableConcept>> safety();

  Optional<Code> language();

  Optional<DateTime> expirationDate();

  Optional<List<Annotation>> note();

  Optional<List<ContactPoint>> contact();

  Optional<String> manufacturer();

  Optional<String> distinctIdentifier();

  Optional<String> lotNumber();

  Optional<CodeableConcept> type();

  Optional<Reference> owner();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<Device_Specialization>> specialization();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Reference> parent();

  String resourceType();

  Optional<String> partNumber();

  Optional<List<Device_DeviceName>> deviceName();

  Optional<Reference> location();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<String> modelNumber();

  Optional<Uri> url();

  Optional<DeviceStatus> status();

  Optional<List<Device_Property>> property();

  Optional<List<Identifier>> identifier();

  static ImmutableDevice.ResourceTypeBuildStage builder() {
    return ImmutableDevice.builder();
  }
}
