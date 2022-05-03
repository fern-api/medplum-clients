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
  Optional<List<ContactPoint>> contact();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Device_DeviceName>> deviceName();

  Optional<List<Extension>> extension();

  Optional<DateTime> expirationDate();

  Optional<Reference> patient();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<Device_Specialization>> specialization();

  Optional<String> lotNumber();

  Optional<Narrative> text();

  Optional<Reference> definition();

  Optional<String> manufacturer();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Device_UdiCarrier>> udiCarrier();

  Optional<List<CodeableConcept>> statusReason();

  Optional<DateTime> manufactureDate();

  Optional<Reference> owner();

  Optional<DeviceStatus> status();

  Optional<Id> id();

  Optional<String> modelNumber();

  Optional<String> serialNumber();

  Optional<List<Identifier>> identifier();

  Optional<List<Annotation>> note();

  Optional<String> partNumber();

  Optional<CodeableConcept> type();

  Optional<List<Device_Property>> property();

  Optional<Reference> parent();

  Optional<Reference> location();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> safety();

  Optional<Uri> url();

  Optional<String> distinctIdentifier();

  Optional<List<Device_Version>> version();

  static ImmutableDevice.ResourceTypeBuildStage builder() {
    return ImmutableDevice.builder();
  }
}
