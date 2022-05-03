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
    as = ImmutableExpression.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Expression {
  Optional<List<Extension>> extension();

  Optional<Uri> reference();

  Optional<ExpressionLanguage> language();

  Optional<String> id();

  Optional<String> description();

  Optional<Id> name();

  Optional<String> expression();

  static ImmutableExpression.Builder builder() {
    return ImmutableExpression.builder();
  }
}
