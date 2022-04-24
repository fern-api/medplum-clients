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
    as = ImmutablePatient_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Patient_Link {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Reference other();

  Optional<Patient_linkType> type();

  Optional<List<Extension>> modifierExtension();

  static ImmutablePatient_Link.OtherBuildStage builder() {
    return ImmutablePatient_Link.builder();
  }
}
