package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Boolean> deleted();

  Optional<CodeableConcept> flag();

  Optional<dateTime> date();

  Reference item();

  static ImmutableList_Entry.ItemBuildStage builder() {
    return ImmutableList_Entry.builder();
  }
}
