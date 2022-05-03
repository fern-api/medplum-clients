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
    as = ImmutableList_Entry.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface List_Entry {
  Optional<CodeableConcept> flag();

  Optional<String> id();

  Reference item();

  Optional<Boolean> deleted();

  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableList_Entry.ItemBuildStage builder() {
    return ImmutableList_Entry.builder();
  }
}
