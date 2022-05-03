package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    as = ImmutableValueSet_Contains.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Contains {
  Optional<List<ValueSet_Designation>> designation();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> inactive();

  Optional<String> id();

  Optional<Uri> system();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<Code> code();

  Optional<List<Extension>> extension();

  Optional<String> display();

  Optional<String> version();

  Optional<List<ValueSet_Contains>> contains();

  static ImmutableValueSet_Contains.Builder builder() {
    return ImmutableValueSet_Contains.builder();
  }
}
