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
    as = ImmutableImagingStudy_Series.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImagingStudy_Series {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<unsignedInt> number();

  Optional<id> uid();

  Optional<List<Reference>> specimen();

  Optional<Coding> laterality();

  Optional<unsignedInt> numberOfInstances();

  Optional<List<Reference>> endpoint();

  Optional<Coding> bodySite();

  Optional<dateTime> started();

  Optional<List<ImagingStudy_Instance>> instance();

  Optional<String> description();

  Optional<List<ImagingStudy_Performer>> performer();

  Coding modality();

  Optional<List<Extension>> extension();

  static ImmutableImagingStudy_Series.ModalityBuildStage builder() {
    return ImmutableImagingStudy_Series.builder();
  }
}
