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
  Optional<List<Extension>> modifierExtension();

  Optional<UnsignedInt> number();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> title();

  Coding sopClass();

  Optional<Id> uid();

  static ImmutableImagingStudy_Instance.SopClassBuildStage builder() {
    return ImmutableImagingStudy_Instance.builder();
  }
}
