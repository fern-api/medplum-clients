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
  Optional<String> partNumber();

  Optional<String> modelNumber();

  Optional<Reference> patient();

  Optional<List<CodeableConcept>> safety();

  Optional<List<Extension>> extension();

  Optional<List<Annotation>> note();

  Optional<List<Identifier>> identifier();

  Optional<String> lotNumber();

  Optional<List<Device_UdiCarrier>> udiCarrier();

  Optional<CodeableConcept> type();

  Optional<Narrative> text();

  Optional<DateTime> manufactureDate();

  Optional<Reference> owner();

  Optional<Uri> url();

  Optional<String> distinctIdentifier();

  Optional<List<ResourceList>> contained();

  Optional<String> serialNumber();

  String resourceType();

  Optional<List<Device_Specialization>> specialization();

  Optional<List<Device_DeviceName>> deviceName();

  Optional<List<ContactPoint>> contact();

  Optional<Code> language();

  Optional<DateTime> expirationDate();

  Optional<String> manufacturer();

  Optional<List<Device_Property>> property();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Reference> parent();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> location();

  Optional<DeviceStatus> status();

  Optional<List<CodeableConcept>> statusReason();

  Optional<Reference> definition();

  Optional<List<Device_Version>> version();

  static ImmutableDevice.ResourceTypeBuildStage builder() {
    return ImmutableDevice.builder();
  }
}
