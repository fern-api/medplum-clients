package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<unsignedInt> number();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<id> uid();

  Optional<String> title();

  Coding sopClass();

  Optional<List<Extension>> extension();

  static ImmutableImagingStudy_Instance.SopClassBuildStage builder() {
    return ImmutableImagingStudy_Instance.builder();
  }
}
