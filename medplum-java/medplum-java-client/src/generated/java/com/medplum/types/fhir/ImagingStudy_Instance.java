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
    as = ImmutableImagingStudy_Instance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImagingStudy_Instance {
  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<UnsignedInt> number();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> uid();

  Optional<String> id();

  Coding sopClass();

  static ImmutableImagingStudy_Instance.SopClassBuildStage builder() {
    return ImmutableImagingStudy_Instance.builder();
  }
}
