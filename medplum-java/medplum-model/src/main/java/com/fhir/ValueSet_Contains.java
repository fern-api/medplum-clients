package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<ValueSet_Contains>> contains();

  Optional<List<Extension>> modifierExtension();

  Optional<String> display();

  Optional<List<Extension>> extension();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<code> code();

  Optional<List<ValueSet_Designation>> designation();

  Optional<String> id();

  Optional<String> version();

  Optional<Boolean> inactive();

  Optional<uri> system();

  static ImmutableValueSet_Contains.Builder builder() {
    return ImmutableValueSet_Contains.builder();
  }
}
